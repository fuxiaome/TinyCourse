package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseTypeExample() {
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

        public Criteria andCourTypeIdIsNull() {
            addCriterion("cour_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdIsNotNull() {
            addCriterion("cour_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdEqualTo(Integer value) {
            addCriterion("cour_type_id =", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotEqualTo(Integer value) {
            addCriterion("cour_type_id <>", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdGreaterThan(Integer value) {
            addCriterion("cour_type_id >", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_type_id >=", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdLessThan(Integer value) {
            addCriterion("cour_type_id <", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cour_type_id <=", value, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdIn(List<Integer> values) {
            addCriterion("cour_type_id in", values, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotIn(List<Integer> values) {
            addCriterion("cour_type_id not in", values, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cour_type_id between", value1, value2, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_type_id not between", value1, value2, "courTypeId");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameIsNull() {
            addCriterion("cour_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameIsNotNull() {
            addCriterion("cour_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameEqualTo(String value) {
            addCriterion("cour_type_name =", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameNotEqualTo(String value) {
            addCriterion("cour_type_name <>", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameGreaterThan(String value) {
            addCriterion("cour_type_name >", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_type_name >=", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameLessThan(String value) {
            addCriterion("cour_type_name <", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameLessThanOrEqualTo(String value) {
            addCriterion("cour_type_name <=", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameLike(String value) {
            addCriterion("cour_type_name like", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameNotLike(String value) {
            addCriterion("cour_type_name not like", value, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameIn(List<String> values) {
            addCriterion("cour_type_name in", values, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameNotIn(List<String> values) {
            addCriterion("cour_type_name not in", values, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameBetween(String value1, String value2) {
            addCriterion("cour_type_name between", value1, value2, "courTypeName");
            return (Criteria) this;
        }

        public Criteria andCourTypeNameNotBetween(String value1, String value2) {
            addCriterion("cour_type_name not between", value1, value2, "courTypeName");
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