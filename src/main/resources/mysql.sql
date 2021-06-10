select username, COUNT(username) as count_of_logins from users
left join user_login on users.id = user_login.user_id
where users.username like "A%" and user_login.login_time = DATE_FORMAT("2021-06-01", "%d/%m/%Y")
group by users.username;