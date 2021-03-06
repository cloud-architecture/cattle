/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ServiceLog;
import io.cattle.platform.core.model.tables.ServiceLogTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "service_log", schema = "cattle")
public class ServiceLogRecord extends UpdatableRecordImpl<ServiceLogRecord> implements TableRecordJaxb, Record14<Long, Long, String, String, Date, Map<String,Object>, Date, String, Long, Long, String, Boolean, String, Long>, ServiceLog {

    private static final long serialVersionUID = 391193374;

    /**
     * Setter for <code>cattle.service_log.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.service_log.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.service_log.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.service_log.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cattle.service_log.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.service_log.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.service_log.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.service_log.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.service_log.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.service_log.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>cattle.service_log.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.service_log.data</code>.
     */
    @Column(name = "data", length = 65535)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(5);
    }

    /**
     * Setter for <code>cattle.service_log.end_time</code>.
     */
    @Override
    public void setEndTime(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.service_log.end_time</code>.
     */
    @Column(name = "end_time")
    @Override
    public Date getEndTime() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.service_log.event_type</code>.
     */
    @Override
    public void setEventType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.service_log.event_type</code>.
     */
    @Column(name = "event_type", length = 255)
    @Override
    public String getEventType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cattle.service_log.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.service_log.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>cattle.service_log.instance_id</code>.
     */
    @Override
    public void setInstanceId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.service_log.instance_id</code>.
     */
    @Column(name = "instance_id", precision = 19)
    @Override
    public Long getInstanceId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>cattle.service_log.transaction_id</code>.
     */
    @Override
    public void setTransactionId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.service_log.transaction_id</code>.
     */
    @Column(name = "transaction_id", length = 255)
    @Override
    public String getTransactionId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>cattle.service_log.sub_log</code>.
     */
    @Override
    public void setSubLog(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.service_log.sub_log</code>.
     */
    @Column(name = "sub_log", nullable = false, precision = 1)
    @Override
    public Boolean getSubLog() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>cattle.service_log.level</code>.
     */
    @Override
    public void setLevel(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.service_log.level</code>.
     */
    @Column(name = "level", length = 255)
    @Override
    public String getLevel() {
        return (String) get(12);
    }

    /**
     * Setter for <code>cattle.service_log.deployment_unit_id</code>.
     */
    @Override
    public void setDeploymentUnitId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.service_log.deployment_unit_id</code>.
     */
    @Column(name = "deployment_unit_id", precision = 19)
    @Override
    public Long getDeploymentUnitId() {
        return (Long) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, String, String, Date, Map<String,Object>, Date, String, Long, Long, String, Boolean, String, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, String, String, Date, Map<String,Object>, Date, String, Long, Long, String, Boolean, String, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ServiceLogTable.SERVICE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ServiceLogTable.SERVICE_LOG.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ServiceLogTable.SERVICE_LOG.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServiceLogTable.SERVICE_LOG.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return ServiceLogTable.SERVICE_LOG.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field6() {
        return ServiceLogTable.SERVICE_LOG.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ServiceLogTable.SERVICE_LOG.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ServiceLogTable.SERVICE_LOG.EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return ServiceLogTable.SERVICE_LOG.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ServiceLogTable.SERVICE_LOG.INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ServiceLogTable.SERVICE_LOG.TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return ServiceLogTable.SERVICE_LOG.SUB_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ServiceLogTable.SERVICE_LOG.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ServiceLogTable.SERVICE_LOG.DEPLOYMENT_UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value6() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getSubLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getDeploymentUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value5(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value6(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value7(Date value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value8(String value) {
        setEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value9(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value10(Long value) {
        setInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value11(String value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value12(Boolean value) {
        setSubLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value13(String value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord value14(Long value) {
        setDeploymentUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceLogRecord values(Long value1, Long value2, String value3, String value4, Date value5, Map<String,Object> value6, Date value7, String value8, Long value9, Long value10, String value11, Boolean value12, String value13, Long value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ServiceLog from) {
        setId(from.getId());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setDescription(from.getDescription());
        setCreated(from.getCreated());
        setData(from.getData());
        setEndTime(from.getEndTime());
        setEventType(from.getEventType());
        setServiceId(from.getServiceId());
        setInstanceId(from.getInstanceId());
        setTransactionId(from.getTransactionId());
        setSubLog(from.getSubLog());
        setLevel(from.getLevel());
        setDeploymentUnitId(from.getDeploymentUnitId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ServiceLog> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceLogRecord
     */
    public ServiceLogRecord() {
        super(ServiceLogTable.SERVICE_LOG);
    }

    /**
     * Create a detached, initialised ServiceLogRecord
     */
    public ServiceLogRecord(Long id, Long accountId, String kind, String description, Date created, Map<String,Object> data, Date endTime, String eventType, Long serviceId, Long instanceId, String transactionId, Boolean subLog, String level, Long deploymentUnitId) {
        super(ServiceLogTable.SERVICE_LOG);

        set(0, id);
        set(1, accountId);
        set(2, kind);
        set(3, description);
        set(4, created);
        set(5, data);
        set(6, endTime);
        set(7, eventType);
        set(8, serviceId);
        set(9, instanceId);
        set(10, transactionId);
        set(11, subLog);
        set(12, level);
        set(13, deploymentUnitId);
    }
}
