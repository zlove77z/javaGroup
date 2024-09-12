show tables; --테이블 보여주기
-- (DDL)
create table test (
	idx int not null auto_increment primary key,/* 고유번호 */
	name varchar(30) not null,    /* 성명 */
	age int default 20,						/* 나이 */
	gender char(2) default '여자',	/* 성별 */
	address varchar(10)						/* 주소 */
);

desc test;    -- 생성된 테이블의 구조보기

drop table test;	-- 테이블 삭제처리
delete from test; /* test테이블의 모든 레코드를 삭제 */
-- DML
insert into test (name,age,gender,address) values ('홍길동',23,'남자','서울');	-- 레코드 삽입
insert into test values (default,'김말숙',30,'여자','청주');
insert into test values (default,'오하늘',default,default,'');
insert into test (name) values ('이사랑');
insert into test values (default,'가나다',30,'여자','청주');
insert into test values (default,'강감찬',60,'남자','부산');
insert into test values (default,'이사랑',19,'여자','인천');
insert into test values (default,'이순신',90,'남자','부산');
insert into test values (default,'강소연',28,'여자','청주');
insert into test values (default,'김영수',33,'남자','청주');
insert into test values (default,'이창식',22,'남자','인천');
insert into test values (default,'박종두',28,'남자','청주');
insert into test values (default,'박세연',21,'여자','제주');
insert into test values (default,'오로지',40,'여자','청주');
insert into test values (default,'오종지',35,'여자','인천');
insert into test values (default,'오종지종',37,'남자','청주');
insert into test values (default,'김자월',22,'여자','제주');
insert into test values (default,'오자월',37,'여자','청주');
insert into test values (default,'오이자월',29,'여자','제주');
insert into test values (default,'김자월화',25,'여자','청주');




update test set age=35 where name='김말숙';
update test set address='제주' where name='김말숙';



select * from test;		/*  테이블의 내용 확인하기 */


-- 청주에 사는 사람들 조회
select * from test where address='청주';

--남자만 출력
select * from test where gender='남자';

--나이가 35세 이상만 출력
select * from test where age >=35;

--남자이면서 청주에 사는 사람
select * from test where gender='남자' and address='청주';

--20세 이상인 여자만.
select * from test where age >= 20 and gender='여자';

--청주나 인천에 거주하는 사람?
select * from test where address='청주' or address='인천';

--여자중에서 청주에 살거나 인천에 거주하는 사람?
select * from test where (address='청주' or address='인천') and gender='여자';

--여자20대 중에서 청주나 인천 거주하는 사람?
select * from test where (address='청주' or address='인천') and gender='여자' and (age>=20 and age<30);

--30대 를 출력하세요?
select * from test where age>=30 and age<40;
select * from test where age between 30 and 39;

--청주/인천에 거주하는 사람?
select * from test where address='인천' or address='청주';
select * from test where address in ('청주','제주');
select * from test where address in ('청','주');

-- 성이 '김'씨인 사람만 출력하시오?
select * from test where name like '김%';

-- 이름중에서 '식'로 끝나는 사람만 출력하시오?
select * from test where name like '%식';

--이름중에서 '종'을 포함한 사람만 출력하시오?
select * from test where name like '%종%'

--이름중에서 두번쨰 글자가 '자'인 사람들 출력?
select * from test where name like '_자%';

-- 청주나 제주에 사는 사람들의 나이를 1살씩 증가시켜주세요?
update test set age = age + 1 where address = '청주' or address ='제주';
update test set age = age + 1 where address in ('청주','제주');

--모든 사람들의 나이를 1살찍 감소 시켜주시오.
update test set age = age -1;

--청주에 사는 남자들을 삭제처리하시오.
delete from test where address='청주' and gender='남자';
select * from test where address='청주' and gender='남자';

--서울 사는 사람들의 '성명/나이/성별'만 출력하시오.
select name,age,gender form test wher address='서울';

--이름순으로 오름차순 출력하세요.
select * from test order by name;
select * from test order by name desc;

--나이 내림차순으로 출력하되, 나이가 같으면 이름 오름차순으로 출력하세요.
select * from test order by age desc, name;









