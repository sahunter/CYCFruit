package action.authority;

import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;



/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class AdminAuthorityInterceptor extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�level����
		String level = (String)ctx.getSession()
			.get(action.WebConstant.LEVEL);
		// ���level��Ϊnull����levelΪemp��mgr
		if (level != null && (level.equals(action.WebConstant.CUS_LEVEL)
			|| level.equals(action.WebConstant.ADMIN_LEVEL)))
		{
			return invocation.invoke();
		}
		return Action.LOGIN;
	}
}