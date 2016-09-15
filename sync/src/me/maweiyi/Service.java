package me.maweiyi;

/**
 * Created by maweiyi on 9/15/16.
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        synchronized (anyString) {
            System.out.println("线程名称为: " + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入同步块");
            usernameParam = username;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordParam = password;
            System.out.println("线程名称为: " + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开同步块");
        }
    }
}
