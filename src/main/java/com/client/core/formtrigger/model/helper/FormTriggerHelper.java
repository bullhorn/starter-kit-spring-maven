package com.client.core.formtrigger.model.helper;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.client.core.formtrigger.model.form.AbstractFormDto;

/**
 * The main interface for form trigger helpers.
 * 
 * @author magnus.palm
 *
 * @param <T> The AbstractFormDto from the bullhorn form
 * @param <E> Bullhorn entity corresponding to the T
 */
public interface FormTriggerHelper<T extends AbstractFormDto<E>, E extends BullhornEntity> {

	/**
	 * Gets the implementation of AbstractFormDto, that is the data from the bullhorn form. This databinding between the request parameters
	 * from the form and T is handled by Spring.
	 * 
	 * @return the T form dto containing data from the bullhorn form
	 */
	public T getFormValues();

	/**
	 * The id of the corporate user saving the form in Bullhorn.
	 * 
	 * @return the user id
	 */
	public Integer getUpdatingUserID();

	/**
	 * Returns the new entity instantiated from the T form values.
	 * 
	 * Example: a FormJobOrderDto will instantiate a JobOrder.
	 * 
	 * @return The bullhorn {@link BullhornEntity} based on the form just saved
	 */
	public E getNewEntity();

	public void setNewEntity(E newEntity);

	/**
	 * The currently stored data for this entity that is saved in bullhorn.
	 * 
	 * @return The currently stored data from bullhorn
	 */
	public E getOldEntity();

	public void setOldEntity(E oldDto);

	/**
	 * The user who made the update
	 * 
	 * @return the user who made the update
	 */
	public CorporateUser getUpdatingUser();

	public void setUpdatingUser(CorporateUser updatingUser);

	/**
	 * The user type of the user who made the update.
	 * 
	 * @return the user type of the user who made the update
	 */
	public UserType getUpdatingUserUserType();

	public void setUpdatingUserUserType(UserType updatingUserUserType);

	/**
	 * Save the entity to bullhorn
	 * 
	 * @param entity any implementation of {@link UpdateEntity}
	 */
	public <U extends UpdateEntity> void saveDto(U entity);

}
