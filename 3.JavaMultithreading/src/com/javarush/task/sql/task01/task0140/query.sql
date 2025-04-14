SELECT ip_from, ip_to, country_name
FROM ip2country
ORDER BY ip_to DESC
LIMIT 10 OFFSET 74;