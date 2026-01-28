CREATE TABLE IF NOT EXISTS flyway_smoketest  (
  id bigserial primary key,
  created_at timestamptz not null default now()
)
