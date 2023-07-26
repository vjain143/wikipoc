-- Replace 'your_schema_name' with the name of the schema containing the tables you want to drop
DO $$ 
DECLARE 
  table_name text;
BEGIN 
  FOR table_name IN (SELECT table_name FROM information_schema.tables WHERE table_schema = 'your_schema_name') 
  LOOP
    EXECUTE 'DROP TABLE IF EXISTS ' || table_name || ' CASCADE';
    RAISE NOTICE 'Dropped table: %', table_name;
  END LOOP;
END $$;
