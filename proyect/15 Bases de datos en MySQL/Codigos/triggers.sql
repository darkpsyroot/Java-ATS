# Triggers 

Delimiter |
create trigger insertarTemp before insert on categoria
for each row 
begin
	insert into temporal (categoria) values (new.nombre);
    
end |



