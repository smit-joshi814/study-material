declare

cursor c is
	select s.s_no,s.name,m.sub1,m.sub2,m.sub3,m.sub4 from stud s,marks m where s.s_no=m.s_no;
rec c%rowtype;
tot number(3);
per number(5,2);
res result.class%type;
Mcount number(1);
begin
	open c;
	loop
	fetch c into rec;
	exit when c%notfound;
	
	tot:= rec.sub1 + rec.sub2 + rec.sub3 + rec.sub4;
	per:= tot / 4;
	
	Mcount:=0;
	
	if( rec.sub1 < 35 ) then
		Mcount:=Mcount + 1;
	end if;
	if( rec.sub2 < 35 ) then
		Mcount:=Mcount + 1;
	end if;
	if( rec.sub3 < 35 ) then
		Mcount:=Mcount + 1;
	end if;
	if( rec.sub4 < 35 ) then
		Mcount:=Mcount + 1;
	end if;
	
	if( Mcount > 2 ) then
		res:='FAIL';
	end if;
	if (Mcount <= 2 ) then
		res:='ATKT';
	end if;
	if( Mcount = 0 ) then
			if( per > 60 ) then
				res:='DIST';
			end if;
			if ( per > 55 and per <= 60) then
				res:='FIRST';
			end if;
			if ( per > 45 and per <= 55) then
				res:='SECOND';
			end if;
			if ( per > 35 and per <= 45 ) then
				res:='THIRD';
			end if;
			if ( per <=35 ) then
				res:='PASS';
			end if;
	end if;
	
	insert into result values(rec.s_no,tot,per,res,rec.name);

	end loop;
commit;
end;