package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNull() {
            addCriterion("tea_age is null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNotNull() {
            addCriterion("tea_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeEqualTo(Integer value) {
            addCriterion("tea_age =", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotEqualTo(Integer value) {
            addCriterion("tea_age <>", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThan(Integer value) {
            addCriterion("tea_age >", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_age >=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThan(Integer value) {
            addCriterion("tea_age <", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tea_age <=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIn(List<Integer> values) {
            addCriterion("tea_age in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotIn(List<Integer> values) {
            addCriterion("tea_age not in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeBetween(Integer value1, Integer value2) {
            addCriterion("tea_age between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_age not between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionIsNull() {
            addCriterion("tea_description is null");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionIsNotNull() {
            addCriterion("tea_description is not null");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionEqualTo(String value) {
            addCriterion("tea_description =", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionNotEqualTo(String value) {
            addCriterion("tea_description <>", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionGreaterThan(String value) {
            addCriterion("tea_description >", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tea_description >=", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionLessThan(String value) {
            addCriterion("tea_description <", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tea_description <=", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionLike(String value) {
            addCriterion("tea_description like", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionNotLike(String value) {
            addCriterion("tea_description not like", value, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionIn(List<String> values) {
            addCriterion("tea_description in", values, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionNotIn(List<String> values) {
            addCriterion("tea_description not in", values, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionBetween(String value1, String value2) {
            addCriterion("tea_description between", value1, value2, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaDescriptionNotBetween(String value1, String value2) {
            addCriterion("tea_description not between", value1, value2, "teaDescription");
            return (Criteria) this;
        }

        public Criteria andTeaImageIsNull() {
            addCriterion("tea_image is null");
            return (Criteria) this;
        }

        public Criteria andTeaImageIsNotNull() {
            addCriterion("tea_image is not null");
            return (Criteria) this;
        }

        public Criteria andTeaImageEqualTo(String value) {
            addCriterion("tea_image =", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageNotEqualTo(String value) {
            addCriterion("tea_image <>", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageGreaterThan(String value) {
            addCriterion("tea_image >", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageGreaterThanOrEqualTo(String value) {
            addCriterion("tea_image >=", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageLessThan(String value) {
            addCriterion("tea_image <", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageLessThanOrEqualTo(String value) {
            addCriterion("tea_image <=", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageLike(String value) {
            addCriterion("tea_image like", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageNotLike(String value) {
            addCriterion("tea_image not like", value, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageIn(List<String> values) {
            addCriterion("tea_image in", values, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageNotIn(List<String> values) {
            addCriterion("tea_image not in", values, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageBetween(String value1, String value2) {
            addCriterion("tea_image between", value1, value2, "teaImage");
            return (Criteria) this;
        }

        public Criteria andTeaImageNotBetween(String value1, String value2) {
            addCriterion("tea_image not between", value1, value2, "teaImage");
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