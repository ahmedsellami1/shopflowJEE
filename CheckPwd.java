import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class CheckPwd {
  public static void main(String[] args) {
    BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
    String hash = "$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lHHi";
    for (String pwd : new String[]{"Password1@","password","admin","Password123","secret","123456"}) {
      System.out.println(pwd + "=" + enc.matches(pwd, hash));
    }
    System.out.println("new=" + enc.encode("Password1@"));
  }
}
