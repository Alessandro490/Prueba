package com.exchange.rodriguezvillalta.model.entities.response;

import java.util.List;
import com.exchange.rodriguezvillalta.model.entities.User;

public class UserResponseData {

	int offset = 0;
	int limit = 2;
	int total = 2;
	int count = 2;
	List<User> results;
	
	public UserResponseData() {
		offset = 0;
		limit = 2;
		total = 2;
		count = 2;
	    results = null;
	  }
	
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<User> getResults() {
		return results;
	}
	
	public void setResults(List<User> results) {
		this.results = results;
	}
	
}
