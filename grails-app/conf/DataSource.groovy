dataSource {
    pooled = true
    driverClassName = "org.postgresql.Driver"
    username = "xfrrxdrflqvzvy"
    password = "DdQ0azV_GS8A8mkz3uFWdobThS"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dialect = org.hibernate.dialect.PostgreSQLDialect
            dbCreate = "none" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "postgres://xfrrxdrflqvzvy:DdQ0azV_GS8A8mkz3uFWdobThS@ec2-54-225-194-162.compute-1.amazonaws.com:5432/ddgagsdfr5tqk8"
        }
    }
    test {
        dataSource {
            driverClassName = "org.h2.Driver"
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            dialect = org.hibernate.dialect.PostgreSQLDialect
            dbCreate = "none"
            url = "postgres://xfrrxdrflqvzvy:DdQ0azV_GS8A8mkz3uFWdobThS@ec2-54-225-194-162.compute-1.amazonaws.com:5432/ddgagsdfr5tqk8"
            pooled = true
            properties {
                maxActive = -1
                minEvictableIdleTimeMillis=1800000
                timeBetweenEvictionRunsMillis=1800000
                numTestsPerEvictionRun=3
                testOnBorrow=true
                testWhileIdle=true
                testOnReturn=true
                validationQuery="SELECT 1"
            }
        }
    }
}