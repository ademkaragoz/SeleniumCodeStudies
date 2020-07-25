package SeleniumMethods;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		///Xpath is slower than CSS
		//CSS is faster than xpath
		//Xpath allows very precise locators
		//CSS allows for selection of elements by their surrounding context
		//Xpath relies on browser's xpath implementation which is not always complete
		//CSS provides a good balance between structure and attributes
		//CSS does not provide sibling, parents, preceding etc....
		
		//     #username
		//     input[id='username'][type='email']
		//     input.form-control.private-form__control.login-email
		//     button[id='loginBtn']
		//     button.login-submit
		
		//Dynamic Elements
		// <input id=test_123>
		// <input id=test_345>
		
		//  input[id*='username'      --contains   
		//  input[id^='username'      -- starting test
		//  input[id$='username'      -- ending text
		//  div>input[id$='username']  -- parent and child relationship
		
		
		
		

	}

}
