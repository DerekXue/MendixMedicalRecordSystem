// This file was generated by Mendix Modeler 7.4.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Administration module
	public static void changeMyPassword(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
			Core.execute(context, "Administration.ChangeMyPassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void changePassword(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
			Core.execute(context, "Administration.ChangePassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void manageMyAccount(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Administration.ManageMyAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void newAccount(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Administration.NewAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Create a new user object and change the default attribute values so the user will be handled as a webservice user.
	 * Finally open the User_NewEdit form so all remaing user information can be set.
	 */
	public static void newWebServiceAccount(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Administration.NewWebServiceAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<system.proxies.TimeZone> retrieveTimeZones(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "Administration.RetrieveTimeZones", params);
			java.util.List<system.proxies.TimeZone> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<system.proxies.TimeZone>();
				for (IMendixObject obj : objs)
					result.add(system.proxies.TimeZone.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void saveNewAccount(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
			Core.execute(context, "Administration.SaveNewAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void showMyPasswordForm(IContext context, administration.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			Core.execute(context, "Administration.ShowMyPasswordForm", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void showPasswordForm(IContext context, administration.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			Core.execute(context, "Administration.ShowPasswordForm", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}