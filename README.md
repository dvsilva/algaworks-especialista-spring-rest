# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 23-34-desafio-restringindo-acessos-aos-endpoints-de-usuarios-grupos-e-permissoes
git add .
git commit -m "Desafio: restringindo acessos aos endpoints de usuários, grupos e permissões"
git push origin 23-34-desafio-restringindo-acessos-aos-endpoints-de-usuarios-grupos-e-permissoes

git checkout master
git merge --no-ff 23-34-desafio-restringindo-acessos-aos-endpoints-de-usuarios-grupos-e-permissoes
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```

configurar hosts

127.0.0.1       api.algafood.local
127.0.0.1       auth.algafood.local
127.0.0.1       www.algafood.local
127.0.0.1       www.matafome.local
127.0.0.1       www.foodanalytics.local