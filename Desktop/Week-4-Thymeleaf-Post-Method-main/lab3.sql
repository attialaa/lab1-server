//3-3 Question 8
DECLARE
BEGIN
    UPDATE new_depts
    SET location_id = 1400
    WHERE location_id = 1700;

    DBMS_OUTPUT.PUT_LINE('Rows updated: ' || SQL%ROWCOUNT);
END;
