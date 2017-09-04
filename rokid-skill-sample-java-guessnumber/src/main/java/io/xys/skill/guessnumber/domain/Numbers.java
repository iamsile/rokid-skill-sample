/**
 * This class is generated by jOOQ
 */
package io.xys.skill.guessnumber.domain;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Numbers extends TableImpl<Record> {

	private static final long serialVersionUID = 1877790680;

	/**
	 * The reference instance of <code>PUBLIC.NUMBERS</code>
	 */
	public static final Numbers NUMBERS = new Numbers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>PUBLIC.NUMBERS.ID</code>.
	 */
	public final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.NUMBERS.USER_ID</code>.
	 */
	public final TableField<Record, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.NUMBERS.NUM</code>.
	 */
	public final TableField<Record, Integer> NUM = createField("NUM", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.NUMBERS</code> table reference
	 */
	public Numbers() {
		this("NUMBERS", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.NUMBERS</code> table reference
	 */
	public Numbers(String alias) {
		this(alias, NUMBERS);
	}

	private Numbers(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Numbers(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<Record> getPrimaryKey() {
		return Keys.CONSTRAINT_B;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<Record>> getKeys() {
		return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_B, Keys.CONSTRAINT_B3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Numbers as(String alias) {
		return new Numbers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Numbers rename(String name) {
		return new Numbers(name, null);
	}
}
