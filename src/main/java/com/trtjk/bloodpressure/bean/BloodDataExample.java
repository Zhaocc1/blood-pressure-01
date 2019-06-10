package com.trtjk.bloodpressure.bean;

import java.util.ArrayList;
import java.util.List;

public class BloodDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloodDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureIsNull() {
            addCriterion("systo_licpressure is null");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureIsNotNull() {
            addCriterion("systo_licpressure is not null");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureEqualTo(Integer value) {
            addCriterion("systo_licpressure =", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureNotEqualTo(Integer value) {
            addCriterion("systo_licpressure <>", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureGreaterThan(Integer value) {
            addCriterion("systo_licpressure >", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("systo_licpressure >=", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureLessThan(Integer value) {
            addCriterion("systo_licpressure <", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureLessThanOrEqualTo(Integer value) {
            addCriterion("systo_licpressure <=", value, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureIn(List<Integer> values) {
            addCriterion("systo_licpressure in", values, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureNotIn(List<Integer> values) {
            addCriterion("systo_licpressure not in", values, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureBetween(Integer value1, Integer value2) {
            addCriterion("systo_licpressure between", value1, value2, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andSystoLicpressureNotBetween(Integer value1, Integer value2) {
            addCriterion("systo_licpressure not between", value1, value2, "systoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureIsNull() {
            addCriterion("diasto_licpressure is null");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureIsNotNull() {
            addCriterion("diasto_licpressure is not null");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureEqualTo(Integer value) {
            addCriterion("diasto_licpressure =", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureNotEqualTo(Integer value) {
            addCriterion("diasto_licpressure <>", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureGreaterThan(Integer value) {
            addCriterion("diasto_licpressure >", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("diasto_licpressure >=", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureLessThan(Integer value) {
            addCriterion("diasto_licpressure <", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureLessThanOrEqualTo(Integer value) {
            addCriterion("diasto_licpressure <=", value, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureIn(List<Integer> values) {
            addCriterion("diasto_licpressure in", values, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureNotIn(List<Integer> values) {
            addCriterion("diasto_licpressure not in", values, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureBetween(Integer value1, Integer value2) {
            addCriterion("diasto_licpressure between", value1, value2, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastoLicpressureNotBetween(Integer value1, Integer value2) {
            addCriterion("diasto_licpressure not between", value1, value2, "diastoLicpressure");
            return (Criteria) this;
        }

        public Criteria andPulseIsNull() {
            addCriterion("pulse is null");
            return (Criteria) this;
        }

        public Criteria andPulseIsNotNull() {
            addCriterion("pulse is not null");
            return (Criteria) this;
        }

        public Criteria andPulseEqualTo(Integer value) {
            addCriterion("pulse =", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotEqualTo(Integer value) {
            addCriterion("pulse <>", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThan(Integer value) {
            addCriterion("pulse >", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pulse >=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThan(Integer value) {
            addCriterion("pulse <", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThanOrEqualTo(Integer value) {
            addCriterion("pulse <=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseIn(List<Integer> values) {
            addCriterion("pulse in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotIn(List<Integer> values) {
            addCriterion("pulse not in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseBetween(Integer value1, Integer value2) {
            addCriterion("pulse between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotBetween(Integer value1, Integer value2) {
            addCriterion("pulse not between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Boolean value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Boolean value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Boolean value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Boolean value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Boolean value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Boolean> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Boolean> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Boolean value1, Boolean value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andUniqueIsNull() {
            addCriterion("unique is null");
            return (Criteria) this;
        }

        public Criteria andUniqueIsNotNull() {
            addCriterion("unique is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueEqualTo(String value) {
            addCriterion("unique =", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueNotEqualTo(String value) {
            addCriterion("unique <>", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueGreaterThan(String value) {
            addCriterion("unique >", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("unique >=", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueLessThan(String value) {
            addCriterion("unique <", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueLessThanOrEqualTo(String value) {
            addCriterion("unique <=", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueLike(String value) {
            addCriterion("unique like", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueNotLike(String value) {
            addCriterion("unique not like", value, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueIn(List<String> values) {
            addCriterion("unique in", values, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueNotIn(List<String> values) {
            addCriterion("unique not in", values, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueBetween(String value1, String value2) {
            addCriterion("unique between", value1, value2, "unique");
            return (Criteria) this;
        }

        public Criteria andUniqueNotBetween(String value1, String value2) {
            addCriterion("unique not between", value1, value2, "unique");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}