package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatExample() {
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

        public Criteria andChatIdIsNull() {
            addCriterion("chat_id is null");
            return (Criteria) this;
        }

        public Criteria andChatIdIsNotNull() {
            addCriterion("chat_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatIdEqualTo(Integer value) {
            addCriterion("chat_id =", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotEqualTo(Integer value) {
            addCriterion("chat_id <>", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdGreaterThan(Integer value) {
            addCriterion("chat_id >", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_id >=", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdLessThan(Integer value) {
            addCriterion("chat_id <", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdLessThanOrEqualTo(Integer value) {
            addCriterion("chat_id <=", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdIn(List<Integer> values) {
            addCriterion("chat_id in", values, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotIn(List<Integer> values) {
            addCriterion("chat_id not in", values, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdBetween(Integer value1, Integer value2) {
            addCriterion("chat_id between", value1, value2, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_id not between", value1, value2, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatUserfromIsNull() {
            addCriterion("chat_userfrom is null");
            return (Criteria) this;
        }

        public Criteria andChatUserfromIsNotNull() {
            addCriterion("chat_userfrom is not null");
            return (Criteria) this;
        }

        public Criteria andChatUserfromEqualTo(Integer value) {
            addCriterion("chat_userfrom =", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromNotEqualTo(Integer value) {
            addCriterion("chat_userfrom <>", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromGreaterThan(Integer value) {
            addCriterion("chat_userfrom >", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_userfrom >=", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromLessThan(Integer value) {
            addCriterion("chat_userfrom <", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromLessThanOrEqualTo(Integer value) {
            addCriterion("chat_userfrom <=", value, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromIn(List<Integer> values) {
            addCriterion("chat_userfrom in", values, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromNotIn(List<Integer> values) {
            addCriterion("chat_userfrom not in", values, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromBetween(Integer value1, Integer value2) {
            addCriterion("chat_userfrom between", value1, value2, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUserfromNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_userfrom not between", value1, value2, "chatUserfrom");
            return (Criteria) this;
        }

        public Criteria andChatUsertoIsNull() {
            addCriterion("chat_userto is null");
            return (Criteria) this;
        }

        public Criteria andChatUsertoIsNotNull() {
            addCriterion("chat_userto is not null");
            return (Criteria) this;
        }

        public Criteria andChatUsertoEqualTo(Integer value) {
            addCriterion("chat_userto =", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoNotEqualTo(Integer value) {
            addCriterion("chat_userto <>", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoGreaterThan(Integer value) {
            addCriterion("chat_userto >", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_userto >=", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoLessThan(Integer value) {
            addCriterion("chat_userto <", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoLessThanOrEqualTo(Integer value) {
            addCriterion("chat_userto <=", value, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoIn(List<Integer> values) {
            addCriterion("chat_userto in", values, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoNotIn(List<Integer> values) {
            addCriterion("chat_userto not in", values, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoBetween(Integer value1, Integer value2) {
            addCriterion("chat_userto between", value1, value2, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatUsertoNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_userto not between", value1, value2, "chatUserto");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNull() {
            addCriterion("chat_date is null");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNotNull() {
            addCriterion("chat_date is not null");
            return (Criteria) this;
        }

        public Criteria andChatDateEqualTo(Date value) {
            addCriterion("chat_date =", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotEqualTo(Date value) {
            addCriterion("chat_date <>", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThan(Date value) {
            addCriterion("chat_date >", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("chat_date >=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThan(Date value) {
            addCriterion("chat_date <", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThanOrEqualTo(Date value) {
            addCriterion("chat_date <=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateIn(List<Date> values) {
            addCriterion("chat_date in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotIn(List<Date> values) {
            addCriterion("chat_date not in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateBetween(Date value1, Date value2) {
            addCriterion("chat_date between", value1, value2, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotBetween(Date value1, Date value2) {
            addCriterion("chat_date not between", value1, value2, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatTextIsNull() {
            addCriterion("chat_text is null");
            return (Criteria) this;
        }

        public Criteria andChatTextIsNotNull() {
            addCriterion("chat_text is not null");
            return (Criteria) this;
        }

        public Criteria andChatTextEqualTo(String value) {
            addCriterion("chat_text =", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotEqualTo(String value) {
            addCriterion("chat_text <>", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextGreaterThan(String value) {
            addCriterion("chat_text >", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextGreaterThanOrEqualTo(String value) {
            addCriterion("chat_text >=", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLessThan(String value) {
            addCriterion("chat_text <", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLessThanOrEqualTo(String value) {
            addCriterion("chat_text <=", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextLike(String value) {
            addCriterion("chat_text like", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotLike(String value) {
            addCriterion("chat_text not like", value, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextIn(List<String> values) {
            addCriterion("chat_text in", values, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotIn(List<String> values) {
            addCriterion("chat_text not in", values, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextBetween(String value1, String value2) {
            addCriterion("chat_text between", value1, value2, "chatText");
            return (Criteria) this;
        }

        public Criteria andChatTextNotBetween(String value1, String value2) {
            addCriterion("chat_text not between", value1, value2, "chatText");
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