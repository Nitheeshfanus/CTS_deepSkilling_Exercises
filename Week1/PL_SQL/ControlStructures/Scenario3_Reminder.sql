SET SERVEROUTPUT ON;

DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT CustomerID, LoanID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || loan_rec.CustomerID
            || ' has Loan '
            || loan_rec.LoanID
            || ' due on '
            || loan_rec.DueDate
        );
    END LOOP;
END;
/