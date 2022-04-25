create database QLBH
use QLBH

create table MatHang(
	MaH nvarchar(10) primary key,
	TenH nvarchar(100) not null,
	DVT nvarchar(10) not null,
	NoiSX nvarchar(50) not null,
	SoLuong int not null
);

create table KhachHang(
	MaK nvarchar(10) primary key,
	TenK nvarchar(100) not null,
	DiaChi nvarchar(100) not null,
	SoDT char(10) not null,
);

create table HoaDon(
	SoHD int primary key,
	MaK nvarchar(10),
	Ngay date not null,
	Constraint FK_MaK foreign key(MaK)
	references KhachHang(MaK)
);

create table ChiTietHoaDon(
	SoHD int,
	MaH nvarchar(10),
	DonGia money not null,
	SoLuong int,
	Constraint PK_ChiTiet primary key(SoHD, MaH),
	Constraint FK_SoHD foreign key(SoHD)
	references HoaDon(SoHD),
	Constraint FK_MaH foreign key(MaH)
	references MatHang(MaH)
);