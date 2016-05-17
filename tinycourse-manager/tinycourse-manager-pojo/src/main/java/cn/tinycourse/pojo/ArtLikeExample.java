package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtLikeExample() {
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

        public Criteria andArtLikeIdIsNull() {
            addCriterion("art_like_id is null");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdIsNotNull() {
            addCriterion("art_like_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdEqualTo(Integer value) {
            addCriterion("art_like_id =", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdNotEqualTo(Integer value) {
            addCriterion("art_like_id <>", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdGreaterThan(Integer value) {
            addCriterion("art_like_id >", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_like_id >=", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdLessThan(Integer value) {
            addCriterion("art_like_id <", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("art_like_id <=", value, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdIn(List<Integer> values) {
            addCriterion("art_like_id in", values, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdNotIn(List<Integer> values) {
            addCriterion("art_like_id not in", values, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdBetween(Integer value1, Integer value2) {
            addCriterion("art_like_id between", value1, value2, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtLikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("art_like_id not between", value1, value2, "artLikeId");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtIdEqualTo(Integer value) {
            addCriterion("art_id =", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotEqualTo(Integer value) {
            addCriterion("art_id <>", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThan(Integer value) {
            addCriterion("art_id >", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_id >=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThan(Integer value) {
            addCriterion("art_id <", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("art_id <=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdIn(List<Integer> values) {
            addCriterion("art_id in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotIn(List<Integer> values) {
            addCriterion("art_id not in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdBetween(Integer value1, Integer value2) {
            addCriterion("art_id between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("art_id not between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateIsNull() {
            addCriterion("art_like_date is null");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateIsNotNull() {
            addCriterion("art_like_date is not null");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateEqualTo(Date value) {
            addCriterion("art_like_date =", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateNotEqualTo(Date value) {
            addCriterion("art_like_date <>", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateGreaterThan(Date value) {
            addCriterion("art_like_date >", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("art_like_date >=", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateLessThan(Date value) {
            addCriterion("art_like_date <", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateLessThanOrEqualTo(Date value) {
            addCriterion("art_like_date <=", value, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateIn(List<Date> values) {
            addCriterion("art_like_date in", values, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateNotIn(List<Date> values) {
            addCriterion("art_like_date not in", values, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateBetween(Date value1, Date value2) {
            addCriterion("art_like_date between", value1, value2, "artLikeDate");
            return (Criteria) this;
        }

        public Criteria andArtLikeDateNotBetween(Date value1, Date value2) {
            addCriterion("art_like_date not between", value1, value2, "artLikeDate");
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