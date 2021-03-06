/**
 */
package Extended_NoSQL_Schema.impl;

import Extended_NoSQL_Schema.Entity;
import Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage;
import Extended_NoSQL_Schema.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.impl.ReferenceImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.impl.ReferenceImpl#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends AssociationImpl implements Reference {
	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Reference opposite;

	/**
	 * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTo()
	 * @generated
	 * @ordered
	 */
	protected Entity refTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Extended_NoSQL_SchemaPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Reference)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Reference newOpposite) {
		Reference oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRefTo() {
		if (refTo != null && refTo.eIsProxy()) {
			InternalEObject oldRefTo = (InternalEObject)refTo;
			refTo = (Entity)eResolveProxy(oldRefTo);
			if (refTo != oldRefTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO, oldRefTo, refTo));
			}
		}
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRefTo() {
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTo(Entity newRefTo) {
		Entity oldRefTo = refTo;
		refTo = newRefTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO, oldRefTo, refTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO:
				if (resolve) return getRefTo();
				return basicGetRefTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)newValue);
				return;
			case Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO:
				setRefTo((Entity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)null);
				return;
			case Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO:
				setRefTo((Entity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.REFERENCE__OPPOSITE:
				return opposite != null;
			case Extended_NoSQL_SchemaPackage.REFERENCE__REF_TO:
				return refTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
