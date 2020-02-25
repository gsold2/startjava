rem launch files
psql -U postgres -f create_db.sql
psql -U postgres -f init_db.sql
psql -U postgres -f queries.sql
