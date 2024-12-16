String query = "SELECT * FROM users WHERE usr = ? AND pwd = ?";
Connection conn = db.getConn();
PreparedStatement pstmt = conn.prepareStatement(query);

// Safely set the parameters to avoid SQL injection
pstmt.setString(1, usr);
pstmt.setString(2, pwd);

ResultSet rs = pstmt.executeQuery();
