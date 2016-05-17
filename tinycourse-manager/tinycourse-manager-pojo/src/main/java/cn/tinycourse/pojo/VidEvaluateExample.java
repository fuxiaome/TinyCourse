package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VidEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VidEvaluateExample() {
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

        public Criteria andVidEvaIdIsNull() {
            addCriterion("vid_eva_id is null");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdIsNotNull() {
            addCriterion("vid_eva_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdEqualTo(Integer value) {
            addCriterion("vid_eva_id =", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdNotEqualTo(Integer value) {
            addCriterion("vid_eva_id <>", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdGreaterThan(Integer value) {
            addCriterion("vid_eva_id >", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_eva_id >=", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdLessThan(Integer value) {
            addCriterion("vid_eva_id <", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdLessThanOrEqualTo(Integer value) {
            addCriterion("vid_eva_id <=", value, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdIn(List<Integer> values) {
            addCriterion("vid_eva_id in", values, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdNotIn(List<Integer> values) {
            addCriterion("vid_eva_id not in", values, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdBetween(Integer value1, Integer value2) {
            addCriterion("vid_eva_id between", value1, value2, "vidEvaId");
            return (Criteria) this;
        }

        public Criteria andVidEvaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_eva_id not between", value1, value2, "vidEvaId");
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

        public Criteria andVidIdIsNull() {
            addCriterion("vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNotNull() {
            addCriterion("vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidIdEqualTo(Integer value) {
            addCriterion("vid_id =", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotEqualTo(Integer value) {
            addCriterion("vid_id <>", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThan(Integer value) {
            addCriterion("vid_id >", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_id >=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThan(Integer value) {
            addCriterion("vid_id <", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThanOrEqualTo(Integer value) {
            addCriterion("vid_id <=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdIn(List<Integer> values) {
            addCriterion("vid_id in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotIn(List<Integer> values) {
            addCriterion("vid_id not in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdBetween(Integer value1, Integer value2) {
            addCriterion("vid_id between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_id not between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextIsNull() {
            addCriterion("vid_eva_text is null");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextIsNotNull() {
            addCriterion("vid_eva_text is not null");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextEqualTo(String value) {
            addCriterion("vid_eva_text =", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextNotEqualTo(String value) {
            addCriterion("vid_eva_text <>", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextGreaterThan(String value) {
            addCriterion("vid_eva_text >", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextGreaterThanOrEqualTo(String value) {
            addCriterion("vid_eva_text >=", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextLessThan(String value) {
            addCriterion("vid_eva_text <", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextLessThanOrEqualTo(String value) {
            addCriterion("vid_eva_text <=", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextLike(String value) {
            addCriterion("vid_eva_text like", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextNotLike(String value) {
            addCriterion("vid_eva_text not like", value, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextIn(List<String> values) {
            addCriterion("vid_eva_text in", values, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextNotIn(List<String> values) {
            addCriterion("vid_eva_text not in", values, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextBetween(String value1, String value2) {
            addCriterion("vid_eva_text between", value1, value2, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaTextNotBetween(String value1, String value2) {
            addCriterion("vid_eva_text not between", value1, value2, "vidEvaText");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateIsNull() {
            addCriterion("vid_eva_date is null");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateIsNotNull() {
            addCriterion("vid_eva_date is not null");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateEqualTo(Date value) {
            addCriterion("vid_eva_date =", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateNotEqualTo(Date value) {
            addCriterion("vid_eva_date <>", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateGreaterThan(Date value) {
            addCriterion("vid_eva_date >", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vid_eva_date >=", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateLessThan(Date value) {
            addCriterion("vid_eva_date <", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateLessThanOrEqualTo(Date value) {
            addCriterion("vid_eva_date <=", value, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateIn(List<Date> values) {
            addCriterion("vid_eva_date in", values, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateNotIn(List<Date> values) {
            addCriterion("vid_eva_date not in", values, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateBetween(Date value1, Date value2) {
            addCriterion("vid_eva_date between", value1, value2, "vidEvaDate");
            return (Criteria) this;
        }

        public Criteria andVidEvaDateNotBetween(Date value1, Date value2) {
            addCriterion("vid_eva_date not between", value1, value2, "vidEvaDate");
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