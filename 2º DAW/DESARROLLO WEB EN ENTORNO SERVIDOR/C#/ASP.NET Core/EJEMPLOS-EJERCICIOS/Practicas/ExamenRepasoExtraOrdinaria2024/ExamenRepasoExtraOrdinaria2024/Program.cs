using ExamenRepasoExtraOrdinaria2024.Data;
using ExamenRepasoExtraOrdinaria2024.Interfaces;
using ExamenRepasoExtraOrdinaria2024.Repositories;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();
builder.Services.AddDbContext<ParkingContext>(
options => {
    options.UseSqlServer("name = Parking_1");

});

builder.Services.AddTransient<IRepositorySocios, RepositorySocios>();
builder.Services.AddTransient<IRepositoryPlazas, RepositoryPlazas>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
