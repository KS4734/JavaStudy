package java_study.co.kr.jungbu;

import java.sql.Connection;  //java에서 제공하는 db server에 접속하는 lib
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java_study.co.kr.jungbu.dto.DeptDto;
import java_study.co.kr.jungbu.dto.EmpDto;
//import com.mysql.cj.jdbc.Driver; //mysql에서 제공하는 접속에 도움을 주는 lib

public class L25JDBC {
	public static void main(String[] args) {
		/*java로 Mysql DBMS 접속 후 scott.emp 내용 불러오기!
		 * 1. Connector J jar 를 다운받고 프로젝트가 참조하기
		 * 2. java.sql.Connection이 동적로딩으로 com.mysql.cj.jdbc.Driver를 이용해 접속을 한다.
		 * 3. java.sql.PreparedStatement 에 sql을 세팅하고 실행 -> return ResultSet
		 * 4. java.sql.ResultSet에 받아온 table data(DataTransferObject)를 처리
		 * */
		String mysqlConnectDriver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/scott"; 
		//localhost 는 동일한 IP(인터넷에서 부여하는 고유 주소)에서 접속 
		//3306 Port : os에서 app(service)를 실행할때 부여하는 고유 번호
		//jdbc:mysql  : mysql 서버를 java가 접속하는 규약
		String user="root";
		String pw="mysql";
		Connection conn=null;
		PreparedStatement pstmt=null; // 쿼리를 실행할때 사용하는 객체:파라미터를 ? 로 지정 가능
		ResultSet rs=null; //테이블을 가져(select)오는 자료구조
		try {
			Class.forName(mysqlConnectDriver);
			//DriverManager(동적로딩) : Class.forName(class명)으로 찾은 클래스를 필요할때 객체로 생성 (자동)
			conn=DriverManager.getConnection(url, user, pw);
			System.out.println(conn); //db server에 접속한 상태 
			String sql="SELECT * FROM emp LEFT JOIN dept USING(deptno) WHERE deptno=?";
			//PreparedSteatement : ?에 파라미터를 세팅하고 실행하는 객체(파라미터 타입을 맞추고 sql injection 해킹 예방 )
			pstmt=conn.prepareStatement(sql); //접속 후 쿼리 실행 준비
			pstmt.setInt(1, 30);
//			pstmt.setString(2, "salesman"); // ' -> \'
			
			rs=pstmt.executeQuery(); //select query를 실행하는 함수
			
			List<EmpDto> empList=new ArrayList<EmpDto>();
			while(rs.next()) {
				EmpDto emp = new EmpDto();
				//튜플의 값을 Map 처럼 찾을 수 있다. 
				//Mysql empno:int -> 통신 (모든 데이터를 문자열로 변환) ->java 파싱
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setComm(rs.getFloat("comm"));
				emp.setSal(rs.getFloat("sal"));
				DeptDto dept=new DeptDto();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				emp.setDept(dept);
				empList.add(emp);
			}
			System.out.println(empList);
			//SWING.JTable
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}