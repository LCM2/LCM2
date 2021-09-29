/**
 * 
 */
package com.cm.lcm2.aop;

import java.util.Collections;
import java.util.List;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.MatchAlwaysTransactionAttributeSource;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * <pre>
 * com.cm.lcm2.aop
 *   |_ TransactionAspect.java
 * </pre>
 * 
 * Desc : 
 * @Company : LCM
 * @Author  : SuChan Kim
 * @Date    : 2021. 9. 29. 오전 9:25:14
 * @Version : 
 */

@Configuration
public class TransactionAspect {
	@Autowired
	private PlatformTransactionManager transactionManager;

	private static final String AOP_TRANSACTION_EXPRESSION = "execution(* com.cm.lcm2.service..*Impl.*(..))";
	
	@Bean
	public TransactionInterceptor transactionAdvice() {
		
		//Rollback Rule
		//Exception (모든 예외처리는 Exception을 상속받음)
		List<RollbackRuleAttribute> rollbackRules = Collections.singletonList(new RollbackRuleAttribute(Exception.class));

		RuleBasedTransactionAttribute transactionAttribute = new RuleBasedTransactionAttribute();
		transactionAttribute.setRollbackRules(rollbackRules);
		transactionAttribute.setName("LCM2TransactionManager");

		MatchAlwaysTransactionAttributeSource attributeSource = new MatchAlwaysTransactionAttributeSource();
		attributeSource.setTransactionAttribute(transactionAttribute);

		return new TransactionInterceptor(transactionManager, attributeSource);
	}

	@Bean
	public Advisor transactionAdvisor() {

		AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
		pointcut.setExpression(AOP_TRANSACTION_EXPRESSION);

		return new DefaultPointcutAdvisor(pointcut, transactionAdvice());
	}
}
