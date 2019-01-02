// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies;

public class Account extends system.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administration.Account";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		PatientDetails_Account("EMRSystem.PatientDetails_Account"),
		Account_PatientDetails("Administration.Account_PatientDetails"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone"),
		PatientDetails_User("EMRSystem.PatientDetails_User");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Administration.Account"));
	}

	protected Account(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject)
	{
		super(context, accountMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Administration.Account", accountMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Administration.Account");
	}

	/**
	 * @deprecated Use 'Account.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administration.proxies.Account.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administration.proxies.Account(context, mendixObject);
	}

	public static administration.proxies.Account load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administration.proxies.Account.initialize(context, mendixObject);
	}

	public static java.util.List<administration.proxies.Account> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Account> result = new java.util.ArrayList<administration.proxies.Account>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Administration.Account" + xpathConstraint))
			result.add(administration.proxies.Account.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser()
	{
		return getIsLocalUser(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLocalUser.toString());
	}

	/**
	 * Set value of IsLocalUser
	 * @param islocaluser
	 */
	public final void setIsLocalUser(java.lang.Boolean islocaluser)
	{
		setIsLocalUser(getContext(), islocaluser);
	}

	/**
	 * Set value of IsLocalUser
	 * @param context
	 * @param islocaluser
	 */
	public final void setIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islocaluser)
	{
		getMendixObject().setValue(context, MemberNames.IsLocalUser.toString(), islocaluser);
	}

	/**
	 * @return value of PatientDetails_Account
	 */
	public final emrsystem.proxies.PatientDetails getPatientDetails_Account() throws com.mendix.core.CoreException
	{
		return getPatientDetails_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of PatientDetails_Account
	 */
	public final emrsystem.proxies.PatientDetails getPatientDetails_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emrsystem.proxies.PatientDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PatientDetails_Account.toString());
		if (identifier != null)
			result = emrsystem.proxies.PatientDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PatientDetails_Account
	 * @param patientdetails_account
	 */
	public final void setPatientDetails_Account(emrsystem.proxies.PatientDetails patientdetails_account)
	{
		setPatientDetails_Account(getContext(), patientdetails_account);
	}

	/**
	 * Set value of PatientDetails_Account
	 * @param context
	 * @param patientdetails_account
	 */
	public final void setPatientDetails_Account(com.mendix.systemwideinterfaces.core.IContext context, emrsystem.proxies.PatientDetails patientdetails_account)
	{
		if (patientdetails_account == null)
			getMendixObject().setValue(context, MemberNames.PatientDetails_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PatientDetails_Account.toString(), patientdetails_account.getMendixObject().getId());
	}

	/**
	 * @return value of Account_PatientDetails
	 */
	public final emrsystem.proxies.PatientDetails getAccount_PatientDetails() throws com.mendix.core.CoreException
	{
		return getAccount_PatientDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_PatientDetails
	 */
	public final emrsystem.proxies.PatientDetails getAccount_PatientDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emrsystem.proxies.PatientDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_PatientDetails.toString());
		if (identifier != null)
			result = emrsystem.proxies.PatientDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_PatientDetails
	 * @param account_patientdetails
	 */
	public final void setAccount_PatientDetails(emrsystem.proxies.PatientDetails account_patientdetails)
	{
		setAccount_PatientDetails(getContext(), account_patientdetails);
	}

	/**
	 * Set value of Account_PatientDetails
	 * @param context
	 * @param account_patientdetails
	 */
	public final void setAccount_PatientDetails(com.mendix.systemwideinterfaces.core.IContext context, emrsystem.proxies.PatientDetails account_patientdetails)
	{
		if (account_patientdetails == null)
			getMendixObject().setValue(context, MemberNames.Account_PatientDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_PatientDetails.toString(), account_patientdetails.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final administration.proxies.Account that = (administration.proxies.Account) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Administration.Account";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
