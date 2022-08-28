package trajy.apigateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import static org.springframework.http.HttpMethod.GET;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private JwtTokenStore tokenStore;

    private static final String[] PUBLIC_PATHS = {
        "hr-oauth/oauth/token",
        "/hr-user/**"
    };

    private static final String[] ROLE_OPERATOR_PATHS = {
        "/hr-worker/**"
    };

    private static final String[] ROLE_ADMIN_PATHS = {
        "/hr-payroll/**",
        //"/hr-user/**"
    };

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(tokenStore);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers(PUBLIC_PATHS).permitAll()
            .antMatchers(GET, ROLE_OPERATOR_PATHS).hasAnyRole("OPERATOR", "ADMIN")
            .antMatchers(ROLE_ADMIN_PATHS).hasRole("ADMIN");
    }
}
