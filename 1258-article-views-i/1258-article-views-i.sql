SELECT distinct author_id as id 
FROM VIEWS 
where author_id = viewer_id
ORDER BY id ASC;
