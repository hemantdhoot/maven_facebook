package basicvprogram2;
abstract class Amazon_Auth
{
	abstract void un();
	abstract void un_mob();
	void login_button()
	{
		System.out.println("Logic");
	}
}
abstract class Amazon_Login extends Amazon_Auth 
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()
	{
		System.out.println("Logic 1");
	}}
public class Abstract_method1 extends Amazon_Login
{
	static void loginwith_mob()
	{ System.out.println("Logic 2");}
	public static void main(String[] args) {
		Abstract_method1 a1 = new Abstract_method1();
		a1.un_as_email();
		a1.un_as_mobile();
		a1.un();
		a1.un_mob();
		a1.login_button();
		a1.registration_button();}
	@Override
	void un_as_email() {
		System.out.println("bjsbhckjh");}
	void un_as_mobile() {}
	void un() {}
	void un_mob() {}}
