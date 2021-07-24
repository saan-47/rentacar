public interface AccountCredentials {
    int id = 0;
    String name = null;
    String Email = null;
    String password = null;
    String address = "";
    long mobile = 0;
    boolean admin = false;

    void Credentails(int id, String name,String Email, String password,String address, boolean admin,long mobile);

}
