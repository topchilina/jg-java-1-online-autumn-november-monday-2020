package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class AndSearchCriteria implements SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }
}