-- Write your code here:
update author
set full_name = case
                    when full_name = 'C. S. Lewis' then 'Clive Staples Lewis'
                    when full_name = 'J. R. R. Tolkien' then 'John Ronald Reuel Tolkien'
                    when full_name = 'Friedrich Nietzsche' then 'Friedrich Wilhelm Nietzsche'
                    when full_name = 'Stephen King' then 'Stephen Edwin King'
                    when full_name = 'Aldous Huxley' then 'Aldous Leonard Huxley'
    end
where full_name in (
                    'C. S. Lewis',
                    'J. R. R. Tolkien',
                    'Friedrich Nietzsche',
                    'Stephen King',
                    'Aldous Huxley'
    );

-- можно написать без последней части where, но это небезопасный вариант, запрос может некорректно отработать
