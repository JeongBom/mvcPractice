package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

public class HelloDao {
	 

	public void insertMember(String name) {
        String sql = "INSERT INTO member VALUES (?)";
        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> getAllMembers() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT * FROM member";
        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()
        ) {
            while (rs.next()) {
                list.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
