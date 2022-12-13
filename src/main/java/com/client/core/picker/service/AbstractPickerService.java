package com.client.core.picker.service;

import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.client.core.picker.model.view.JsonIdName;
import com.client.core.picker.model.wrapper.PickerRequestWrapper;
import com.google.common.collect.Lists;
import org.apache.log4j.Logger;

import java.util.List;

public abstract class AbstractPickerService<T extends JsonIdName, E> implements PickerService<T> {

    private final Logger log = Logger.getLogger(getClass());
	
	protected abstract List<E> findRecords(PickerRequestWrapper wrapper);
	
	protected abstract List<E> queryRecords(PickerRequestWrapper wrapper);
	
	protected abstract List<E> sortAndFilterRecords(PickerRequestWrapper wrapper, List<E> records);
	
	protected abstract T convertOneRecord(E record);

	@Override
	public ListWrapper<T> getInitialValue(PickerRequestWrapper wrapper) {
		List<E> records = findRecords(wrapper);
		
		return convertRecords(records, records.size(), wrapper.getStart());
	}
	
	@Override
	public ListWrapper<T> getData(PickerRequestWrapper wrapper) {
		List<E> records = queryRecords(wrapper);
		
		records = sortAndFilterRecords(wrapper, records);

		Integer total = records.size();
		
		if(records.size() > wrapper.getStart() + wrapper.getCount()) {
			records = records.subList(wrapper.getStart(), wrapper.getStart()+wrapper.getCount());
		} else if(wrapper.getStart() < records.size()) {
			records = records.subList(wrapper.getStart(), records.size());
		} else {
			records = Lists.newArrayList();
		}

        List<E> staticValues = getStaticValues();

        for(int index = 0; index < staticValues.size(); index++) {
            records.add(index, staticValues.get(index));
        }
		
		return convertRecords(records, total, wrapper.getStart());
	}

    protected List<E> getStaticValues() {
        return Lists.newArrayList();
    }
	
	protected ListWrapper<T> convertRecords(List<E> records, Integer total, Integer start) {
		List<T> views = Lists.newArrayList();
		
		for(E record : records) {
			views.add(convertOneRecord(record));
		}
		
		ListWrapper<T> wrapper = new StandardListWrapper(views);
		
		wrapper.setTotal(total);
		wrapper.setCount(records.size());
		wrapper.setStart(start);
		
		return wrapper;
	}

    protected Logger getLog() {
        return log;
    }

}