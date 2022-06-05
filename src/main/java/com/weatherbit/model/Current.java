
package com.weatherbit.model;

import com.weatherbit.model.Datum;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Current {

    private List<Datum> data = null;
    private Integer count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
