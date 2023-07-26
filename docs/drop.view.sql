-- Replace 'your_schema_name' with the name of the schema containing the tables you want to drop
DECLARE 
  table_name varchar;
  query varchar;
BEGIN 
  FOR table_name IN (SELECT table_name FROM information_schema.tables WHERE table_schema = 'your_schema_name') 
  LOOP
    SET query = 'DROP TABLE IF EXISTS ' || table_name || ' CASCADE';
    EXECUTE IMMEDIATE query;
    SELECT 'Dropped table: ' || table_name;
  END LOOP;
END;
