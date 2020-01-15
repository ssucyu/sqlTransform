package sun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class sunPg {

	public static void main(String[] args) {

		List<IndexResultVO> list = new ArrayList<>();
		Connection con = Util.getCon();

		String sql1 = "select * from index_result";
		PreparedStatement p;
		try {
			p = con.prepareStatement(sql1);
			ResultSet executeQuery = p.executeQuery();

			while (executeQuery.next()) {
				String id = executeQuery.getString("ID");
				String creatorId = executeQuery.getString("CREATOR_ID");
				Timestamp updatedTime = executeQuery.getTimestamp("UPDATED_TIME");
				Timestamp createTime = executeQuery.getTimestamp("CREATE_TIME");
				String updatorId = executeQuery.getString("UPDATOR_ID");
				String indexCode = executeQuery.getString("INDEX_CODE");
				String indexName = executeQuery.getString("INDEX_NAME");
				Double indexValue = executeQuery.getDouble("INDEX_VALUE");
				Double lastYearSame = executeQuery.getDouble("LAST_YEAR_SAME");
				Double yearOnYearCent = executeQuery.getDouble("YEAR_ON_YEAR_CENT");
				Double monthOnMonthCent = executeQuery.getDouble("MONTH_ON_MONTH_CENT");
				Double plannedSpeed = executeQuery.getDouble("PLANNED_SPEED");
				String indexWarning = executeQuery.getString("INDEX_WARNING");
				String orgMrid = executeQuery.getString("ORG_MRID");
				String orgName = executeQuery.getString("ORG_NAME");
				String indexType = executeQuery.getString("INDEX_TYPE");
				String orgLevel = executeQuery.getString("ORG_LEVEL");
				String submitWay = executeQuery.getString("SUBMIT_WAY");
				Double lastYearTotal = executeQuery.getDouble("LAST_YEAR_TOTAL");
				Double totalValue = executeQuery.getDouble("TOTAL_VALUE");
				Double totalYearCent = executeQuery.getDouble("TOTAL_YEAR_CENT");
				Double indexAimValue = executeQuery.getDouble("INDEX_AIM_VALUE");
				String countTime = executeQuery.getString("COUNT_TIME");
				String indexId = executeQuery.getString("INDEX_ID");
				String countCycle = executeQuery.getString("COUNT_CYCLE");

				IndexResultVO vo = new IndexResultVO(id, creatorId, updatedTime, createTime, updatorId, indexCode,
						indexName, indexValue, lastYearSame, yearOnYearCent, monthOnMonthCent, plannedSpeed,
						indexWarning, orgMrid, orgName, orgLevel, indexType, submitWay, lastYearTotal, totalValue,
						totalYearCent, indexAimValue, countTime, indexId, countCycle);
				list.add(vo);
			}

			System.out.println(list.size());

			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			try {
				for (IndexResultVO vo : list) {

					StringBuffer sql = null;

					sql = new StringBuffer("INSERT INTO index_result ("
							+ "ID, INDEX_CODE, INDEX_NAME, INDEX_TYPE, ORG_NAME, ORG_MRID,"
							+ " COUNT_TIME, INDEX_AIM_VALUE, INDEX_VALUE, LAST_YEAR_SAME, YEAR_ON_YEAR_CENT, MONTH_ON_MONTH_CENT, "
							+ "PLANNED_SPEED, TOTAL_VALUE, LAST_YEAR_TOTAL, TOTAL_YEAR_CENT, CREATOR_ID, UPDATED_TIME,"
							+ " CREATE_TIME, UPDATOR_ID, COUNT_CYCLE, INDEX_WARNING, SUBMIT_WAY, INDEX_ID, "
							+ "ORG_LEVEL) VALUES ( '");


					sql.append(UUID.randomUUID() + "' , '");
					if ("" != vo.getIndexCode()) {
						sql.append(vo.getIndexCode() + "' , '");
					}
					if ("" != vo.getIndexName()) {
						sql.append(vo.getIndexName() + "' , ");
					}

					//
					if ("" != vo.getIndexType()) {
						sql.append("'" + vo.getIndexType() + "' , '");
					} else {
						sql.append("null , '");
					}

					if ("" != vo.getOrgName()) {
						sql.append(vo.getOrgName() + "' , '");
					}
					if ("" != vo.getOrgMrid()) {
						sql.append(vo.getOrgMrid() + "' , '");
					}

					if ("" != vo.getCountTime()) {
						sql.append(vo.getCountTime() + "' , ");
					}

					
					if (0 != vo.getIndexAimValue()) {
						sql.append(vo.getIndexAimValue() + " , ");
					} else {
						sql.append("null , ");
					}
					//
					if (0 != vo.getIndexValue()) {
						sql.append(vo.getIndexValue() + " , ");
					} else {
						sql.append("null , ");
					}
					if (0 != vo.getLastYearSame()) {
						sql.append(vo.getLastYearSame() + " , ");
					} else {
						sql.append("null , ");
					}
					if (0 != vo.getYearOnYearCent()) {
						sql.append(vo.getYearOnYearCent() + " , ");
					} else {
						sql.append("null , ");
					}
					if (0 != vo.getMonthOnMonthCent()) {
						sql.append(vo.getMonthOnMonthCent() + " , ");
					} else {
						sql.append("null , ");
					}

					if (0 != vo.getPlannedSpeed()) {
						sql.append(vo.getPlannedSpeed() + " , ");
					} else {
						sql.append("null , ");
					}
					if (null != vo.getTotalValue()) {
						sql.append(vo.getTotalValue() + " , ");
					} else {
						sql.append("null , ");
					}
					if (0 != vo.getLastYearTotal()) {
						sql.append(vo.getLastYearTotal() + " , ");
					} else {
						sql.append("null , ");
					}
					if (0 != vo.getTotalYearCent()) {
						sql.append(vo.getTotalYearCent() + " , '");
					} else {
						sql.append("null , '");
					}

					if ("" != vo.getCreatorId()) {
						sql.append(vo.getCreatorId() + "' , '");
					} else {
						sql.append("' , '");
					}

					if (null != vo.getUpdatedTime()) {
						sql.append(vo.getUpdatedTime() + "' , '");
					} else {
						sql.append("' , '");
					}

					if (null != vo.getCreateTime()) {
						sql.append(vo.getCreateTime() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getUpdatorId()) {
						sql.append(vo.getUpdatorId() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getCountCycle()) {
						sql.append(vo.getCountCycle() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getIndexWarning()) {
						sql.append(vo.getIndexWarning() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getSubmitWay()) {
						sql.append(vo.getSubmitWay() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getIndexId()) {
						sql.append(vo.getIndexId() + "' , '");
					} else {
						sql.append("' , '");
					}

					if ("" != vo.getOrgLevel()) {
						sql.append(vo.getOrgLevel() + "'");
					} else {
						sql.append("'");
					}

					sql.append(" )");
					SQLQuery q = session.createSQLQuery(new String(sql));
					q.executeUpdate();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			transaction.commit();
			session.close();
			// sf.close();
			sessionFactory.close();

			System.out.println(executeQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}}
