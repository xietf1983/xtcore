/**
 * 
 */
package com.dhiyosys;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * @author abhakthan
 *
 */
public class TokenAuthenticationFilter extends FormAuthenticationFilter {

	@Override
	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
		AuthenticationToken a = super.createToken(request, response);
		return a;
	}
}
