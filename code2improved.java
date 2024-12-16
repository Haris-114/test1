public class SecureHttpRequest {
    public static void main(String[] args) {
        try {
            String url = "https://my-service.cloud.biz/Login";
            String payload = "{\"usr\": \"username\", \"pwd\": \"password\"}";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("User-Agent", "SecureClient/1.0");
            con.setDoOutput(true);
            try (OutputStream os = con.getOutputStream()) {
                os.write(payload.getBytes());
                os.flush();
            }
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
