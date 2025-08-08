using marcoBatista2ev.Data;
using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Repositories;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();

builder.Services.AddDbContext<GestionTareasContext>(
options => {
    options.UseSqlServer("name = Examen2");

});

builder.Services.AddTransient<IRepositoryTareas, RepositoryTareas>();
builder.Services.AddTransient<IRepositoryUsuarios, RepositoryUsuarios>();

//sesion
builder.Services.AddDistributedMemoryCache(); // Necesario para sesiones  
builder.Services.AddSession(options => {
    options.IdleTimeout = TimeSpan.FromMinutes(10); // Expira tras 10 min de inactividad  
});

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

app.UseSession();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
