package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
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

        public Criteria andMsgTextIsNull() {
            addCriterion("msg_text is null");
            return (Criteria) this;
        }

        public Criteria andMsgTextIsNotNull() {
            addCriterion("msg_text is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTextEqualTo(String value) {
            addCriterion("msg_text =", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotEqualTo(String value) {
            addCriterion("msg_text <>", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextGreaterThan(String value) {
            addCriterion("msg_text >", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextGreaterThanOrEqualTo(String value) {
            addCriterion("msg_text >=", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLessThan(String value) {
            addCriterion("msg_text <", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLessThanOrEqualTo(String value) {
            addCriterion("msg_text <=", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLike(String value) {
            addCriterion("msg_text like", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotLike(String value) {
            addCriterion("msg_text not like", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextIn(List<String> values) {
            addCriterion("msg_text in", values, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotIn(List<String> values) {
            addCriterion("msg_text not in", values, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextBetween(String value1, String value2) {
            addCriterion("msg_text between", value1, value2, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotBetween(String value1, String value2) {
            addCriterion("msg_text not between", value1, value2, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNull() {
            addCriterion("msg_date is null");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNotNull() {
            addCriterion("msg_date is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDateEqualTo(Date value) {
            addCriterionForJDBCDate("msg_date =", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("msg_date <>", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThan(Date value) {
            addCriterionForJDBCDate("msg_date >", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_date >=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThan(Date value) {
            addCriterionForJDBCDate("msg_date <", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_date <=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateIn(List<Date> values) {
            addCriterionForJDBCDate("msg_date in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("msg_date not in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_date between", value1, value2, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_date not between", value1, value2, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDoneIsNull() {
            addCriterion("msg_done is null");
            return (Criteria) this;
        }

        public Criteria andMsgDoneIsNotNull() {
            addCriterion("msg_done is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDoneEqualTo(Integer value) {
            addCriterion("msg_done =", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneNotEqualTo(Integer value) {
            addCriterion("msg_done <>", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneGreaterThan(Integer value) {
            addCriterion("msg_done >", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_done >=", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneLessThan(Integer value) {
            addCriterion("msg_done <", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneLessThanOrEqualTo(Integer value) {
            addCriterion("msg_done <=", value, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneIn(List<Integer> values) {
            addCriterion("msg_done in", values, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneNotIn(List<Integer> values) {
            addCriterion("msg_done not in", values, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneBetween(Integer value1, Integer value2) {
            addCriterion("msg_done between", value1, value2, "msgDone");
            return (Criteria) this;
        }

        public Criteria andMsgDoneNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_done not between", value1, value2, "msgDone");
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