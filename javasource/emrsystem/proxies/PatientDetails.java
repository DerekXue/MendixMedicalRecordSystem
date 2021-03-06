// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emrsystem.proxies;

public class PatientDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject patientDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EMRSystem.PatientDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PatientIC("PatientIC"),
		PatientName("PatientName"),
		CurrentlyOnTreatment("CurrentlyOnTreatment"),
		DateOfRegistration("DateOfRegistration"),
		ContactNumber("ContactNumber"),
		NextOfKeenContactNumber("NextOfKeenContactNumber"),
		HomeAddress("HomeAddress"),
		StatusApproved("StatusApproved"),
		ForMedicalResearch("ForMedicalResearch"),
		ViewByHCP("ViewByHCP"),
		PatientDetails_User("EMRSystem.PatientDetails_User"),
		PatientDetails_Account("EMRSystem.PatientDetails_Account"),
		Account_PatientDetails("Administration.Account_PatientDetails");

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

	public PatientDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EMRSystem.PatientDetails"));
	}

	protected PatientDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject patientDetailsMendixObject)
	{
		if (patientDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EMRSystem.PatientDetails", patientDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EMRSystem.PatientDetails");

		this.patientDetailsMendixObject = patientDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PatientDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emrsystem.proxies.PatientDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emrsystem.proxies.PatientDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emrsystem.proxies.PatientDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emrsystem.proxies.PatientDetails(context, mendixObject);
	}

	public static emrsystem.proxies.PatientDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emrsystem.proxies.PatientDetails.initialize(context, mendixObject);
	}

	public static java.util.List<emrsystem.proxies.PatientDetails> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emrsystem.proxies.PatientDetails> result = new java.util.ArrayList<emrsystem.proxies.PatientDetails>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EMRSystem.PatientDetails" + xpathConstraint))
			result.add(emrsystem.proxies.PatientDetails.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PatientIC
	 */
	public final java.lang.String getPatientIC()
	{
		return getPatientIC(getContext());
	}

	/**
	 * @param context
	 * @return value of PatientIC
	 */
	public final java.lang.String getPatientIC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PatientIC.toString());
	}

	/**
	 * Set value of PatientIC
	 * @param patientic
	 */
	public final void setPatientIC(java.lang.String patientic)
	{
		setPatientIC(getContext(), patientic);
	}

	/**
	 * Set value of PatientIC
	 * @param context
	 * @param patientic
	 */
	public final void setPatientIC(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String patientic)
	{
		getMendixObject().setValue(context, MemberNames.PatientIC.toString(), patientic);
	}

	/**
	 * @return value of PatientName
	 */
	public final java.lang.String getPatientName()
	{
		return getPatientName(getContext());
	}

	/**
	 * @param context
	 * @return value of PatientName
	 */
	public final java.lang.String getPatientName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PatientName.toString());
	}

	/**
	 * Set value of PatientName
	 * @param patientname
	 */
	public final void setPatientName(java.lang.String patientname)
	{
		setPatientName(getContext(), patientname);
	}

	/**
	 * Set value of PatientName
	 * @param context
	 * @param patientname
	 */
	public final void setPatientName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String patientname)
	{
		getMendixObject().setValue(context, MemberNames.PatientName.toString(), patientname);
	}

	/**
	 * @return value of CurrentlyOnTreatment
	 */
	public final java.lang.Boolean getCurrentlyOnTreatment()
	{
		return getCurrentlyOnTreatment(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentlyOnTreatment
	 */
	public final java.lang.Boolean getCurrentlyOnTreatment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CurrentlyOnTreatment.toString());
	}

	/**
	 * Set value of CurrentlyOnTreatment
	 * @param currentlyontreatment
	 */
	public final void setCurrentlyOnTreatment(java.lang.Boolean currentlyontreatment)
	{
		setCurrentlyOnTreatment(getContext(), currentlyontreatment);
	}

	/**
	 * Set value of CurrentlyOnTreatment
	 * @param context
	 * @param currentlyontreatment
	 */
	public final void setCurrentlyOnTreatment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean currentlyontreatment)
	{
		getMendixObject().setValue(context, MemberNames.CurrentlyOnTreatment.toString(), currentlyontreatment);
	}

	/**
	 * @return value of DateOfRegistration
	 */
	public final java.util.Date getDateOfRegistration()
	{
		return getDateOfRegistration(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfRegistration
	 */
	public final java.util.Date getDateOfRegistration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfRegistration.toString());
	}

	/**
	 * Set value of DateOfRegistration
	 * @param dateofregistration
	 */
	public final void setDateOfRegistration(java.util.Date dateofregistration)
	{
		setDateOfRegistration(getContext(), dateofregistration);
	}

	/**
	 * Set value of DateOfRegistration
	 * @param context
	 * @param dateofregistration
	 */
	public final void setDateOfRegistration(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofregistration)
	{
		getMendixObject().setValue(context, MemberNames.DateOfRegistration.toString(), dateofregistration);
	}

	/**
	 * @return value of ContactNumber
	 */
	public final java.lang.Integer getContactNumber()
	{
		return getContactNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactNumber
	 */
	public final java.lang.Integer getContactNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ContactNumber.toString());
	}

	/**
	 * Set value of ContactNumber
	 * @param contactnumber
	 */
	public final void setContactNumber(java.lang.Integer contactnumber)
	{
		setContactNumber(getContext(), contactnumber);
	}

	/**
	 * Set value of ContactNumber
	 * @param context
	 * @param contactnumber
	 */
	public final void setContactNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contactnumber)
	{
		getMendixObject().setValue(context, MemberNames.ContactNumber.toString(), contactnumber);
	}

	/**
	 * @return value of NextOfKeenContactNumber
	 */
	public final java.lang.Integer getNextOfKeenContactNumber()
	{
		return getNextOfKeenContactNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of NextOfKeenContactNumber
	 */
	public final java.lang.Integer getNextOfKeenContactNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NextOfKeenContactNumber.toString());
	}

	/**
	 * Set value of NextOfKeenContactNumber
	 * @param nextofkeencontactnumber
	 */
	public final void setNextOfKeenContactNumber(java.lang.Integer nextofkeencontactnumber)
	{
		setNextOfKeenContactNumber(getContext(), nextofkeencontactnumber);
	}

	/**
	 * Set value of NextOfKeenContactNumber
	 * @param context
	 * @param nextofkeencontactnumber
	 */
	public final void setNextOfKeenContactNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nextofkeencontactnumber)
	{
		getMendixObject().setValue(context, MemberNames.NextOfKeenContactNumber.toString(), nextofkeencontactnumber);
	}

	/**
	 * @return value of HomeAddress
	 */
	public final java.lang.String getHomeAddress()
	{
		return getHomeAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of HomeAddress
	 */
	public final java.lang.String getHomeAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HomeAddress.toString());
	}

	/**
	 * Set value of HomeAddress
	 * @param homeaddress
	 */
	public final void setHomeAddress(java.lang.String homeaddress)
	{
		setHomeAddress(getContext(), homeaddress);
	}

	/**
	 * Set value of HomeAddress
	 * @param context
	 * @param homeaddress
	 */
	public final void setHomeAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String homeaddress)
	{
		getMendixObject().setValue(context, MemberNames.HomeAddress.toString(), homeaddress);
	}

	/**
	 * @return value of StatusApproved
	 */
	public final java.lang.Boolean getStatusApproved()
	{
		return getStatusApproved(getContext());
	}

	/**
	 * @param context
	 * @return value of StatusApproved
	 */
	public final java.lang.Boolean getStatusApproved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StatusApproved.toString());
	}

	/**
	 * Set value of StatusApproved
	 * @param statusapproved
	 */
	public final void setStatusApproved(java.lang.Boolean statusapproved)
	{
		setStatusApproved(getContext(), statusapproved);
	}

	/**
	 * Set value of StatusApproved
	 * @param context
	 * @param statusapproved
	 */
	public final void setStatusApproved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean statusapproved)
	{
		getMendixObject().setValue(context, MemberNames.StatusApproved.toString(), statusapproved);
	}

	/**
	 * @return value of ForMedicalResearch
	 */
	public final java.lang.Boolean getForMedicalResearch()
	{
		return getForMedicalResearch(getContext());
	}

	/**
	 * @param context
	 * @return value of ForMedicalResearch
	 */
	public final java.lang.Boolean getForMedicalResearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ForMedicalResearch.toString());
	}

	/**
	 * Set value of ForMedicalResearch
	 * @param formedicalresearch
	 */
	public final void setForMedicalResearch(java.lang.Boolean formedicalresearch)
	{
		setForMedicalResearch(getContext(), formedicalresearch);
	}

	/**
	 * Set value of ForMedicalResearch
	 * @param context
	 * @param formedicalresearch
	 */
	public final void setForMedicalResearch(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean formedicalresearch)
	{
		getMendixObject().setValue(context, MemberNames.ForMedicalResearch.toString(), formedicalresearch);
	}

	/**
	 * @return value of ViewByHCP
	 */
	public final java.lang.Boolean getViewByHCP()
	{
		return getViewByHCP(getContext());
	}

	/**
	 * @param context
	 * @return value of ViewByHCP
	 */
	public final java.lang.Boolean getViewByHCP(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ViewByHCP.toString());
	}

	/**
	 * Set value of ViewByHCP
	 * @param viewbyhcp
	 */
	public final void setViewByHCP(java.lang.Boolean viewbyhcp)
	{
		setViewByHCP(getContext(), viewbyhcp);
	}

	/**
	 * Set value of ViewByHCP
	 * @param context
	 * @param viewbyhcp
	 */
	public final void setViewByHCP(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean viewbyhcp)
	{
		getMendixObject().setValue(context, MemberNames.ViewByHCP.toString(), viewbyhcp);
	}

	/**
	 * @return value of PatientDetails_User
	 */
	public final system.proxies.User getPatientDetails_User() throws com.mendix.core.CoreException
	{
		return getPatientDetails_User(getContext());
	}

	/**
	 * @param context
	 * @return value of PatientDetails_User
	 */
	public final system.proxies.User getPatientDetails_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PatientDetails_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PatientDetails_User
	 * @param patientdetails_user
	 */
	public final void setPatientDetails_User(system.proxies.User patientdetails_user)
	{
		setPatientDetails_User(getContext(), patientdetails_user);
	}

	/**
	 * Set value of PatientDetails_User
	 * @param context
	 * @param patientdetails_user
	 */
	public final void setPatientDetails_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User patientdetails_user)
	{
		if (patientdetails_user == null)
			getMendixObject().setValue(context, MemberNames.PatientDetails_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PatientDetails_User.toString(), patientdetails_user.getMendixObject().getId());
	}

	/**
	 * @return value of PatientDetails_Account
	 */
	public final administration.proxies.Account getPatientDetails_Account() throws com.mendix.core.CoreException
	{
		return getPatientDetails_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of PatientDetails_Account
	 */
	public final administration.proxies.Account getPatientDetails_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PatientDetails_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PatientDetails_Account
	 * @param patientdetails_account
	 */
	public final void setPatientDetails_Account(administration.proxies.Account patientdetails_account)
	{
		setPatientDetails_Account(getContext(), patientdetails_account);
	}

	/**
	 * Set value of PatientDetails_Account
	 * @param context
	 * @param patientdetails_account
	 */
	public final void setPatientDetails_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account patientdetails_account)
	{
		if (patientdetails_account == null)
			getMendixObject().setValue(context, MemberNames.PatientDetails_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PatientDetails_Account.toString(), patientdetails_account.getMendixObject().getId());
	}

	/**
	 * @return value of Account_PatientDetails
	 */
	public final administration.proxies.Account getAccount_PatientDetails() throws com.mendix.core.CoreException
	{
		return getAccount_PatientDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_PatientDetails
	 */
	public final administration.proxies.Account getAccount_PatientDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_PatientDetails.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_PatientDetails
	 * @param account_patientdetails
	 */
	public final void setAccount_PatientDetails(administration.proxies.Account account_patientdetails)
	{
		setAccount_PatientDetails(getContext(), account_patientdetails);
	}

	/**
	 * Set value of Account_PatientDetails
	 * @param context
	 * @param account_patientdetails
	 */
	public final void setAccount_PatientDetails(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account account_patientdetails)
	{
		if (account_patientdetails == null)
			getMendixObject().setValue(context, MemberNames.Account_PatientDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_PatientDetails.toString(), account_patientdetails.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return patientDetailsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final emrsystem.proxies.PatientDetails that = (emrsystem.proxies.PatientDetails) obj;
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
		return "EMRSystem.PatientDetails";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
