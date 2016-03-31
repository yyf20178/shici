package com.itranswarp.shici.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.itranswarp.warpdb.entity.BaseEntity;

/**
 * Category that contains a list of courses.
 * 
 * @author michael
 */
@Entity
@Table
public class Resource extends BaseEntity {

	@Column(length = VARCHAR_100, nullable = false, updatable = false)
	public String refType;

	@Column(length = ID_LENGTH, nullable = false, updatable = false)
	public String refId;

	@Column(nullable = false)
	public boolean deleted;

	@Column(nullable = false)
	public long size;

	@Column(length = VARCHAR_100, nullable = false)
	public String name;

	@Column(length = VARCHAR_100, nullable = false)
	public String meta;

	@Column(length = VARCHAR_100, nullable = false)
	public String mime;

	@Column(length = VARCHAR_1000, nullable = false)
	public String url;

	@Column(length = VARCHAR_1000, nullable = false)
	public String internalUrl;

	@Column(length = VARCHAR_1000, nullable = false)
	public String largeImageUrl;

	@Column(length = VARCHAR_1000, nullable = false)
	public String mediumImageUrl;

	@Column(length = VARCHAR_1000, nullable = false)
	public String smallImageUrl;

	@Override
	public String toString() {
		return "{Resource: name=" + name + ", size=" + size + "}";
	}

}
