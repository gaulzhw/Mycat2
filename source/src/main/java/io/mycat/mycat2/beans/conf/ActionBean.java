package io.mycat.mycat2.beans.conf;

import java.util.Map;

/**
 *
 *
 * @date: 24/10/2017
 * @author: gaul
 */
public class ActionBean {
    private Map<String, String> blocks;
    private Map<String, String> filters;

    public Map<String, String> getBlocks() {
        return blocks;
    }

    public void setBlocks(Map<String, String> blocks) {
        this.blocks = blocks;
    }

    public Map<String, String> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, String> filters) {
        this.filters = filters;
    }
}
