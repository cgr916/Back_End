package com.atguigu.crowd.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsrAcctIsNull() {
            addCriterion("usr_acct is null");
            return (Criteria) this;
        }

        public Criteria andUsrAcctIsNotNull() {
            addCriterion("usr_acct is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAcctEqualTo(String value) {
            addCriterion("usr_acct =", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctNotEqualTo(String value) {
            addCriterion("usr_acct <>", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctGreaterThan(String value) {
            addCriterion("usr_acct >", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctGreaterThanOrEqualTo(String value) {
            addCriterion("usr_acct >=", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctLessThan(String value) {
            addCriterion("usr_acct <", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctLessThanOrEqualTo(String value) {
            addCriterion("usr_acct <=", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctLike(String value) {
            addCriterion("usr_acct like", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctNotLike(String value) {
            addCriterion("usr_acct not like", value, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctIn(List<String> values) {
            addCriterion("usr_acct in", values, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctNotIn(List<String> values) {
            addCriterion("usr_acct not in", values, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctBetween(String value1, String value2) {
            addCriterion("usr_acct between", value1, value2, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrAcctNotBetween(String value1, String value2) {
            addCriterion("usr_acct not between", value1, value2, "usrAcct");
            return (Criteria) this;
        }

        public Criteria andUsrPswdIsNull() {
            addCriterion("usr_pswd is null");
            return (Criteria) this;
        }

        public Criteria andUsrPswdIsNotNull() {
            addCriterion("usr_pswd is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPswdEqualTo(String value) {
            addCriterion("usr_pswd =", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdNotEqualTo(String value) {
            addCriterion("usr_pswd <>", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdGreaterThan(String value) {
            addCriterion("usr_pswd >", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdGreaterThanOrEqualTo(String value) {
            addCriterion("usr_pswd >=", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdLessThan(String value) {
            addCriterion("usr_pswd <", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdLessThanOrEqualTo(String value) {
            addCriterion("usr_pswd <=", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdLike(String value) {
            addCriterion("usr_pswd like", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdNotLike(String value) {
            addCriterion("usr_pswd not like", value, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdIn(List<String> values) {
            addCriterion("usr_pswd in", values, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdNotIn(List<String> values) {
            addCriterion("usr_pswd not in", values, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdBetween(String value1, String value2) {
            addCriterion("usr_pswd between", value1, value2, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrPswdNotBetween(String value1, String value2) {
            addCriterion("usr_pswd not between", value1, value2, "usrPswd");
            return (Criteria) this;
        }

        public Criteria andUsrAliasIsNull() {
            addCriterion("usr_alias is null");
            return (Criteria) this;
        }

        public Criteria andUsrAliasIsNotNull() {
            addCriterion("usr_alias is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAliasEqualTo(String value) {
            addCriterion("usr_alias =", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasNotEqualTo(String value) {
            addCriterion("usr_alias <>", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasGreaterThan(String value) {
            addCriterion("usr_alias >", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasGreaterThanOrEqualTo(String value) {
            addCriterion("usr_alias >=", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasLessThan(String value) {
            addCriterion("usr_alias <", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasLessThanOrEqualTo(String value) {
            addCriterion("usr_alias <=", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasLike(String value) {
            addCriterion("usr_alias like", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasNotLike(String value) {
            addCriterion("usr_alias not like", value, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasIn(List<String> values) {
            addCriterion("usr_alias in", values, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasNotIn(List<String> values) {
            addCriterion("usr_alias not in", values, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasBetween(String value1, String value2) {
            addCriterion("usr_alias between", value1, value2, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andUsrAliasNotBetween(String value1, String value2) {
            addCriterion("usr_alias not between", value1, value2, "usrAlias");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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