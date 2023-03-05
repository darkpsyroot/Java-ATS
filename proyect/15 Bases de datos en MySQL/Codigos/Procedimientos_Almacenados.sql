# Procedimientos Almacenados

delimiter //
create procedure productosXcategoria (in id int)
begin
	select * from producto where idCategoria=id;
    
end//

delimiter ; 

call productosXcategoria(3);
